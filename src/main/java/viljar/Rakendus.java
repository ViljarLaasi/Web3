package jaagup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	@RequestMapping("/geomeetriline_keskmine")
		String gk(String arv1, String arv2){
			if(arv1==null){return "andmed puuduvad";}
			int a1=Integer.parseInt(arv1);
			int a2=Integer.parseInt(arv2);
			return arv1+"ja"+arv2+"geomeetriline keskmine on " +a1*a2;
		}
	@RequestMapping("/tervita")
				String gk(String arv1, String arv2){
					if(arv1==null){return "andmed puuduvad";}
					int a1=Integer.parseInt(arv1);
					int a2=Integer.parseInt(arv2);
					return arv1+"ja"+arv2+"geomeetriline keskmine on " +a1*a2;
	    }


    public static void main(String[] args) {
		//System.getProperties().put("server.port", 35878);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash tellib pakku kaasa
//mvn package commpileerib
//java -jar target/boot3-1.0-SNAPSHOT.jar commpileerib koodi
