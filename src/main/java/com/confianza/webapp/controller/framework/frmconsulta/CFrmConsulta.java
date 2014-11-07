package com.confianza.webapp.controller.framework.frmconsulta;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
 
import com.confianza.webapp.service.framework.frmconsulta.FrmConsultaService;
import com.confianza.webapp.repository.framework.frmconsulta.FrmConsulta;

@Controller
@RequestMapping("/FrmConsulta")
public class CFrmConsulta {

	private FrmConsultaService frmconsultaService;
	
	@Autowired
	public CFrmConsulta(FrmConsultaService frmconsultaService) {
		this.frmconsultaService = frmconsultaService;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public FrmConsulta list(Long id){
		
		return this.frmconsultaService.list(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<FrmConsulta> listAll(){
	
		return this.frmconsultaService.listAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public FrmConsulta update(Long id){
		return this.frmconsultaService.update(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus( HttpStatus.OK )
	@ResponseBody
	public void delete(Long id){
		this.frmconsultaService.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public FrmConsulta insert(@RequestBody FrmConsulta frmconsulta){
		return this.frmconsultaService.insert(frmconsulta);
	}
}
