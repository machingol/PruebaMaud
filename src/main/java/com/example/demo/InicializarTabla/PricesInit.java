package com.example.demo.InicializarTabla;



import java.text.SimpleDateFormat;
import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cadena;
import com.example.demo.entity.Prices;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.PricesRepository;




@Service
public class PricesInit implements ApplicationRunner {

    private PricesRepository pricesRepository;
    private BrandRepository brandRepository;

    
    @Autowired
    public PricesInit(PricesRepository pricesRepository) {
        this.pricesRepository = pricesRepository;
    }
  
    @Autowired
    public void BrandRepository(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	
    	
    	Cadena brand = new Cadena();
    	brand.setName("ZARA");
    brandRepository.save(brand);
    

	String fec_Inicio = "";
	String fec_Final = "";
	
		Prices p1 = new Prices();    	
        	//Valores fijos
			p1.setCadena(brand);
        	p1.setPriceList(1);
        	p1.setProductId(35455);
        	p1.setCurrency("EUR");      				  
        	fec_Inicio = "2020-06-14 00:00:00"; 
        	fec_Final =  "2020-12-31 23:59:59";
         	p1.setStartDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Inicio));
        	p1.setEndDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Final));
        	p1.setPriority(0);
        	p1.setPrice(35.50);
        pricesRepository.save(p1);

        	
       Prices p2 = new Prices();
            p2.setCadena(brand);
        	p2.setPriceList(2);
        	p2.setProductId(35455);
        	p2.setCurrency("EUR");
        	fec_Inicio = "2020-06-14 15:00:00"; 
        	fec_Final =  "2020-06-14 18:30:00";
         	p2.setStartDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Inicio));
        	p2.setEndDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Final));
        	p2.setPriority(1);
        	p2.setPrice(25.45);
        pricesRepository.save(p2);

        Prices p3 = new Prices();
	    	//Valores fijos
	        p3.setCadena(brand);
	    	p3.setPriceList(3);
	    	p3.setProductId(35455);
	    	p3.setCurrency("EUR");
	    	fec_Inicio = "2020-06-15 00:00:00"; 
	    	fec_Final =  "2020-06-15 11:00:00";
	     	p3.setStartDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Inicio));
	    	p3.setEndDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Final));
	    	p3.setPriority(1);
	    	p3.setPrice(30.50);
	    pricesRepository.save(p3);
    
	    Prices p4 = new Prices();
		    p4.setCadena(brand);
			p4.setPriceList(4);
			p4.setProductId(35455);
			p4.setCurrency("EUR");
			fec_Inicio = "2020-06-15 16:00:00"; 
			fec_Final =  "2020-12-31 23:59:59";
		 	p4.setStartDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Inicio));
			p4.setEndDate((Date) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(fec_Final));
			p4.setPriority(1);
			p4.setPrice(38.95);
		pricesRepository.save(p4);

    }   	


}
