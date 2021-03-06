package it.csi.gescovid.acquistiapi.business.be.impl.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacRMagazProd;

public interface BaseCovidacRMagazProdMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_r_magaz_prod", "where prodmag_id = #{prodmagId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer prodmagId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_r_magaz_prod (magaz_id, prod_id, ", "quantita_disponibile, quantita_distribuita, ",
			"validita_inizio, validita_fine, ", "data_creazione, data_modifica, ",
			"data_cancellazione, utente_operazione)",
			"values (#{magazId,jdbcType=INTEGER}, #{prodId,jdbcType=INTEGER}, ",
			"#{quantitaDisponibile,jdbcType=INTEGER}, #{quantitaDistribuita,jdbcType=INTEGER}, ",
			"#{validitaInizio,jdbcType=TIMESTAMP}, #{validitaFine,jdbcType=TIMESTAMP}, ",
			"#{dataCreazione,jdbcType=TIMESTAMP}, #{dataModifica,jdbcType=TIMESTAMP}, ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "prodmagId")
	int insert(CovidacRMagazProd record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Select({ "select", "prodmag_id, magaz_id, prod_id, quantita_disponibile, quantita_distribuita, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_r_magaz_prod", "where prodmag_id = #{prodmagId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "prodmag_id", property = "prodmagId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER),
			@Result(column = "prod_id", property = "prodId", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantita_disponibile", property = "quantitaDisponibile", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantita_distribuita", property = "quantitaDistribuita", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	CovidacRMagazProd selectByPrimaryKey(Integer prodmagId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Select({ "select", "prodmag_id, magaz_id, prod_id, quantita_disponibile, quantita_distribuita, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_r_magaz_prod" })
	@Results({ @Result(column = "prodmag_id", property = "prodmagId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER),
			@Result(column = "prod_id", property = "prodId", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantita_disponibile", property = "quantitaDisponibile", jdbcType = JdbcType.INTEGER),
			@Result(column = "quantita_distribuita", property = "quantitaDistribuita", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	List<CovidacRMagazProd> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod
	 * @mbg.generated
	 */
	@Update({ "update covidac_r_magaz_prod", "set magaz_id = #{magazId,jdbcType=INTEGER},",
			"prod_id = #{prodId,jdbcType=INTEGER},", "quantita_disponibile = #{quantitaDisponibile,jdbcType=INTEGER},",
			"quantita_distribuita = #{quantitaDistribuita,jdbcType=INTEGER},",
			"validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
			"validita_fine = #{validitaFine,jdbcType=TIMESTAMP},",
			"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}",
			"where prodmag_id = #{prodmagId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacRMagazProd record);
}