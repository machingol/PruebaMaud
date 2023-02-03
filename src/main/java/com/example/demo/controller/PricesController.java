package com.example.demo.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cadena;
import com.example.demo.entity.Prices;
import com.example.demo.model.informacionSalida;
import com.example.demo.repository.PricesRepository;


@RestController
@RequestMapping("/api")

@Service
public class PricesController {
	

	@Autowired
	PricesRepository PricesRepository;
	

	@GetMapping("/tutorials/published/{idCadena}/{idProducto}")
	public ResponseEntity<List<informacionSalida>>  findByPublished(@PathVariable Integer idCadena,@PathVariable Long idProducto,
			@RequestParam(value = "fecha", required = false) String fechaBusqueda) {
		
		/*
		 * Se ha realizado de la siguiente manera
		 * 	-	El idCadena e idProducto se pone obligatorio (ya que hay que saber desde donde se consulta y que producto se requiere
		 * 	-	La fecha de consulta es opcional:
		 * 			-	Si se introduce 	-> Se busca sobre esa hora
		 * 			-	Si no se introduce 	-> Se hace una busqueda del dia y hora de busqueda actual
		 * 				(NO PROBADO,MIRAR
		 */
	 
		
		Date date = new Date(0);

		if (fechaBusqueda == null) {

			//Falta de implantar
		}else {
				try {
					date = (Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fechaBusqueda);
				} catch (Exception e) {
					
				}  
		}
		


		try {
		Cadena cad = new Cadena();
			cad.setEid(idCadena);
		
		List<Prices> listaPrecios = PricesRepository.findByBrand_Product(cad, idProducto.intValue(),date);

		List<informacionSalida> listaInfoSalida = new ArrayList<informacionSalida>();
		
			if (listaPrecios != null && !listaPrecios.isEmpty()) {
				for (int idx = 0; idx< listaPrecios.size(); idx++) {
					informacionSalida infoSalida = new informacionSalida();
						//Se han encontrado valores... pero a ver la fecha
						infoSalida.setProductId(listaPrecios.get(idx).getProductId());
						infoSalida.setBRAND_ID(listaPrecios.get(idx).getCadena().getEid());
						infoSalida.setPriceList(listaPrecios.get(idx).getPriceList());
						infoSalida.setStartDate(listaPrecios.get(idx).getStartDate());
						infoSalida.setEndDate(listaPrecios.get(idx).getEndDate());
						infoSalida.setPrice(listaPrecios.get(idx).getPrice());

					listaInfoSalida.add(infoSalida);
				}

				return new ResponseEntity<>(listaInfoSalida, HttpStatus.OK);
			}else {
				
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}


			

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}


}
