package com.confianza.webapp.service.framework.frmperfmodu;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		framework  
  */                          

import java.util.List;
import com.confianza.webapp.repository.framework.frmperfmodu.FrmPerfmodu;

public interface FrmPerfmoduService{
	
	public FrmPerfmodu list(Long id);
	
	public List<FrmPerfmodu> listAll();	
	
	public FrmPerfmodu update(Long id);
	
	public void delete(Long id);
	
	public FrmPerfmodu insert(FrmPerfmodu frmperfmodu);
	
}
