package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PartnerController {

	/*@Autowired
	PartnerRepository partnerRepository;*/
	
	
	 @RequestMapping("/home")  
	public String getAllNotes() {
	    return "home";
	}

	/*@RequestMapping(value = "/saveSignature", method = RequestMethod.POST)
	public String saveSignature(@RequestParam("txtSignature") String txtSignature) {

		Signature signature = new Signature();
		signature.setSignature(txtSignature.getBytes());
		signatureRepository.save(signature);
		return "signature_retrieve";
		
	}
	
	@RequestMapping(value = "/retriveSignature", method = RequestMethod.POST)
	public String retriveSignature( Model model) {
		byte[] sign1 = displaySignature();
		String signa = new String(sign1);
		model.addAttribute("signature", signa);
		return "signature-display";
	}
	
	@RequestMapping(value = "/backToSignature", method = RequestMethod.POST)
	public String backToSignature( Model model) {
		return "signature-pad";
	}

	public byte[] displaySignature() {
		signatureRepository.findAll();
		ArrayList<Signature> signs = (ArrayList<Signature>) signatureRepository.findAll();
		return signs.get(signs.size() - 1).getSignature();
	}*/

}
