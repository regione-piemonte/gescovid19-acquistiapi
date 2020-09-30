package it.csi.gescovid.acquistiapi.business.be.impl.mapper.extended;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacRMagazProd;
import it.csi.gescovid.acquistiapi.business.be.impl.mapper.generated.BaseCovidacRMagazProdMapper;

public interface CovidacRMagazProdMapper extends BaseCovidacRMagazProdMapper {

/*	@Update({ "update covidac_r_magaz_prod",
			"set validita_fine = date_trunc ('day', to_timestamp('${dataValiditaFine}', 'dd/mm/yyyy') - interval '1 day'),",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
			"where prodmag_id = #{prodmagId,jdbcType=INTEGER}" })
	int updateValiditaFineByPrimaryKey(@Param("dataValiditaFine") String dataValiditaFine,
			@Param("prodmagId") Integer prodmagId, @Param("dataModifica") Date dataModifica,
			@Param("utenteOperazione") String utenteModifica);
	*/
	
	
	@Update({ "update covidac_r_magaz_prod", "set magaz_id = #{magazId,jdbcType=INTEGER},",
		"prod_id = #{prodId,jdbcType=INTEGER},", "quantita_disponibile = #{quantitaDisponibile,jdbcType=INTEGER},",
		"quantita_distribuita = #{quantitaDistribuita,jdbcType=INTEGER},",
		"validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
		"validita_fine =  (now() - interval '1 second'),",
		"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
		"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
		"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
		"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
		"where prodmag_id = #{prodmagId,jdbcType=INTEGER}" })
	int updateDataValiditaFineByPrimaryKey(CovidacRMagazProd record);
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_r_magaz_prod (magaz_id, prod_id, ", "quantita_disponibile, quantita_distribuita, ",
			"validita_inizio, validita_fine, ", "data_creazione,  ",
			"data_cancellazione, utente_operazione)",
			"values (#{magazId,jdbcType=INTEGER}, #{prodId,jdbcType=INTEGER}, ",
			"#{quantitaDisponibile,jdbcType=INTEGER}, #{quantitaDistribuita,jdbcType=INTEGER}, ",
			"now(), #{validitaFine,jdbcType=TIMESTAMP}, ",
			"now(),  ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "prodmagId")
	int insertValiditaInizioNow(CovidacRMagazProd record);
	

}
