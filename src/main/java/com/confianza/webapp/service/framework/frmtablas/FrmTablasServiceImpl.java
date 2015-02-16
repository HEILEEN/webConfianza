package com.confianza.webapp.service.framework.frmtablas;

 /**                          
  *                           
  * @modifico	CONFIANZA
  * @version	1.0 
  * @Fecha		30/10/2014 
  * @since		1.0            
  * @app		framework  
  */                          

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.confianza.webapp.repository.framework.frmtablas.FrmTablas;
import com.confianza.webapp.repository.framework.frmtablas.FrmTablasRepository;

@Service
public class FrmTablasServiceImpl implements FrmTablasService{
	
	@Autowired
	private FrmTablasRepository frmTablasRepository;
	
	/**
	 * @return the frmtablasRepository
	 */
	public FrmTablasRepository getFrmTablasRepository() {
		return frmTablasRepository;
	}

	/**
	 * @param frmtablasRepository the frmtablasRepository to set
	 */
	public void setFrmTablasRepository(FrmTablasRepository frmtablasRepository) {
		this.frmTablasRepository = frmtablasRepository;
	}
	
	@Override
	public FrmTablas list(Long id){
		return frmTablasRepository.list(id);
	}
	
	@Override
	public List<FrmTablas> listAll(){
		return frmTablasRepository.listAll();
	}	
	
	@Override
	public FrmTablas update(Long id){
		return frmTablasRepository.update(id);
	}
	
	@Override
	public void delete(Long id){
		frmTablasRepository.delete(id);
	}
	
	@Override
	public FrmTablas insert(FrmTablas frmtablas){
		return frmTablasRepository.insert(frmtablas);
	}
	
	@Override
	public FrmTablas listByTablcodi(String tablcodi){
		return frmTablasRepository.listByTablcodi(tablcodi);
	}
	
}
