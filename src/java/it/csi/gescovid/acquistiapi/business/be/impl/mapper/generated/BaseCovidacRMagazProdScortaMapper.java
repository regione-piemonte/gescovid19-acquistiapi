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

import it.csi.gescovid.acquistiapi.business.be.impl.mapper.dto.CovidacRMagazProdScorta;

public interface BaseCovidacRMagazProdScortaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod_scorta
	 * @mbg.generated
	 */
	@Delete({ "delete from covidac_r_magaz_prod_scorta", "where pmsc_id = #{pmscId,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer pmscId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod_scorta
	 * @mbg.generated
	 */
	@Insert({ "insert into covidac_r_magaz_prod_scorta (pmsc_scorta_minima, pmsc_scorta_massima, ",
			"magaz_id, prod_id, ", "validita_inizio, validita_fine, ", "data_creazione, data_modifica, ",
			"data_cancellazione, utente_operazione)",
			"values (#{pmscScortaMinima,jdbcType=INTEGER}, #{pmscScortaMassima,jdbcType=INTEGER}, ",
			"#{magazId,jdbcType=INTEGER}, #{prodId,jdbcType=INTEGER}, ",
			"#{validitaInizio,jdbcType=TIMESTAMP}, #{validitaFine,jdbcType=TIMESTAMP}, ",
			"#{dataCreazione,jdbcType=TIMESTAMP}, #{dataModifica,jdbcType=TIMESTAMP}, ",
			"#{dataCancellazione,jdbcType=TIMESTAMP}, #{utenteOperazione,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "pmscId")
	int insert(CovidacRMagazProdScorta record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod_scorta
	 * @mbg.generated
	 */
	@Select({ "select", "pmsc_id, pmsc_scorta_minima, pmsc_scorta_massima, magaz_id, prod_id, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_r_magaz_prod_scorta", "where pmsc_id = #{pmscId,jdbcType=INTEGER}" })
	@Results({ @Result(column = "pmsc_id", property = "pmscId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pmsc_scorta_minima", property = "pmscScortaMinima", jdbcType = JdbcType.INTEGER),
			@Result(column = "pmsc_scorta_massima", property = "pmscScortaMassima", jdbcType = JdbcType.INTEGER),
			@Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER),
			@Result(column = "prod_id", property = "prodId", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	CovidacRMagazProdScorta selectByPrimaryKey(Integer pmscId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod_scorta
	 * @mbg.generated
	 */
	@Select({ "select", "pmsc_id, pmsc_scorta_minima, pmsc_scorta_massima, magaz_id, prod_id, validita_inizio, ",
			"validita_fine, data_creazione, data_modifica, data_cancellazione, utente_operazione",
			"from covidac_r_magaz_prod_scorta" })
	@Results({ @Result(column = "pmsc_id", property = "pmscId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "pmsc_scorta_minima", property = "pmscScortaMinima", jdbcType = JdbcType.INTEGER),
			@Result(column = "pmsc_scorta_massima", property = "pmscScortaMassima", jdbcType = JdbcType.INTEGER),
			@Result(column = "magaz_id", property = "magazId", jdbcType = JdbcType.INTEGER),
			@Result(column = "prod_id", property = "prodId", jdbcType = JdbcType.INTEGER),
			@Result(column = "validita_inizio", property = "validitaInizio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "validita_fine", property = "validitaFine", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_creazione", property = "dataCreazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_modifica", property = "dataModifica", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "data_cancellazione", property = "dataCancellazione", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "utente_operazione", property = "utenteOperazione", jdbcType = JdbcType.VARCHAR) })
	List<CovidacRMagazProdScorta> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table covidac_r_magaz_prod_scorta
	 * @mbg.generated
	 */
	@Update({ "update covidac_r_magaz_prod_scorta", "set pmsc_scorta_minima = #{pmscScortaMinima,jdbcType=INTEGER},",
			"pmsc_scorta_massima = #{pmscScortaMassima,jdbcType=INTEGER},", "magaz_id = #{magazId,jdbcType=INTEGER},",
			"prod_id = #{prodId,jdbcType=INTEGER},", "validita_inizio = #{validitaInizio,jdbcType=TIMESTAMP},",
			"validita_fine = #{validitaFine,jdbcType=TIMESTAMP},",
			"data_creazione = #{dataCreazione,jdbcType=TIMESTAMP},",
			"data_modifica = #{dataModifica,jdbcType=TIMESTAMP},",
			"data_cancellazione = #{dataCancellazione,jdbcType=TIMESTAMP},",
			"utente_operazione = #{utenteOperazione,jdbcType=VARCHAR}", "where pmsc_id = #{pmscId,jdbcType=INTEGER}" })
	int updateByPrimaryKey(CovidacRMagazProdScorta record);
}