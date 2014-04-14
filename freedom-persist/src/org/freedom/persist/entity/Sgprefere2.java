package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgprefere2 generated by hbm2java
 */
public class Sgprefere2 implements java.io.Serializable {

	private Sgprefere2Id id;
	private Atatendente atatendente;
	private Vdtipocli vdtipocli;
	private Sgittabela sgittabelaBySgprefere2fksgitta;
	private Attipoatendo attipoatendoBySgprefere2fkattipo;
	private Attipoatendo attipoatendoBySgprefere2fk2attip;
	private Vdvendedor vdvendedor;
	private Vdclascli vdclascli;
	private Sgittabela sgittabelaBySgprefere2fksgitt2;
	private Attipoatendo attipoatendoBySgprefere2fk3attip;
	private Integer codsetat;
	private Integer codfilialsa;
	private Integer codempsa;
	private Integer codsetat2;
	private Integer codfilials2;
	private Integer codemps2;
	private String classmedida;
	private String cabtermr01;
	private String cabtermr02;
	private String rodtermr;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere2() {
	}

	public Sgprefere2(Sgprefere2Id id, Vdvendedor vdvendedor, Date dtins,
			Date hins, String idusuins) {
		this.id = id;
		this.vdvendedor = vdvendedor;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprefere2(Sgprefere2Id id, Atatendente atatendente,
			Vdtipocli vdtipocli, Sgittabela sgittabelaBySgprefere2fksgitta,
			Attipoatendo attipoatendoBySgprefere2fkattipo,
			Attipoatendo attipoatendoBySgprefere2fk2attip,
			Vdvendedor vdvendedor, Vdclascli vdclascli,
			Sgittabela sgittabelaBySgprefere2fksgitt2,
			Attipoatendo attipoatendoBySgprefere2fk3attip, Integer codsetat,
			Integer codfilialsa, Integer codempsa, Integer codsetat2,
			Integer codfilials2, Integer codemps2, String classmedida,
			String cabtermr01, String cabtermr02, String rodtermr, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.atatendente = atatendente;
		this.vdtipocli = vdtipocli;
		this.sgittabelaBySgprefere2fksgitta = sgittabelaBySgprefere2fksgitta;
		this.attipoatendoBySgprefere2fkattipo = attipoatendoBySgprefere2fkattipo;
		this.attipoatendoBySgprefere2fk2attip = attipoatendoBySgprefere2fk2attip;
		this.vdvendedor = vdvendedor;
		this.vdclascli = vdclascli;
		this.sgittabelaBySgprefere2fksgitt2 = sgittabelaBySgprefere2fksgitt2;
		this.attipoatendoBySgprefere2fk3attip = attipoatendoBySgprefere2fk3attip;
		this.codsetat = codsetat;
		this.codfilialsa = codfilialsa;
		this.codempsa = codempsa;
		this.codsetat2 = codsetat2;
		this.codfilials2 = codfilials2;
		this.codemps2 = codemps2;
		this.classmedida = classmedida;
		this.cabtermr01 = cabtermr01;
		this.cabtermr02 = cabtermr02;
		this.rodtermr = rodtermr;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere2Id getId() {
		return this.id;
	}

	public void setId(Sgprefere2Id id) {
		this.id = id;
	}

	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	public Vdtipocli getVdtipocli() {
		return this.vdtipocli;
	}

	public void setVdtipocli(Vdtipocli vdtipocli) {
		this.vdtipocli = vdtipocli;
	}

	public Sgittabela getSgittabelaBySgprefere2fksgitta() {
		return this.sgittabelaBySgprefere2fksgitta;
	}

	public void setSgittabelaBySgprefere2fksgitta(
			Sgittabela sgittabelaBySgprefere2fksgitta) {
		this.sgittabelaBySgprefere2fksgitta = sgittabelaBySgprefere2fksgitta;
	}

	public Attipoatendo getAttipoatendoBySgprefere2fkattipo() {
		return this.attipoatendoBySgprefere2fkattipo;
	}

	public void setAttipoatendoBySgprefere2fkattipo(
			Attipoatendo attipoatendoBySgprefere2fkattipo) {
		this.attipoatendoBySgprefere2fkattipo = attipoatendoBySgprefere2fkattipo;
	}

	public Attipoatendo getAttipoatendoBySgprefere2fk2attip() {
		return this.attipoatendoBySgprefere2fk2attip;
	}

	public void setAttipoatendoBySgprefere2fk2attip(
			Attipoatendo attipoatendoBySgprefere2fk2attip) {
		this.attipoatendoBySgprefere2fk2attip = attipoatendoBySgprefere2fk2attip;
	}

	public Vdvendedor getVdvendedor() {
		return this.vdvendedor;
	}

	public void setVdvendedor(Vdvendedor vdvendedor) {
		this.vdvendedor = vdvendedor;
	}

	public Vdclascli getVdclascli() {
		return this.vdclascli;
	}

	public void setVdclascli(Vdclascli vdclascli) {
		this.vdclascli = vdclascli;
	}

	public Sgittabela getSgittabelaBySgprefere2fksgitt2() {
		return this.sgittabelaBySgprefere2fksgitt2;
	}

	public void setSgittabelaBySgprefere2fksgitt2(
			Sgittabela sgittabelaBySgprefere2fksgitt2) {
		this.sgittabelaBySgprefere2fksgitt2 = sgittabelaBySgprefere2fksgitt2;
	}

	public Attipoatendo getAttipoatendoBySgprefere2fk3attip() {
		return this.attipoatendoBySgprefere2fk3attip;
	}

	public void setAttipoatendoBySgprefere2fk3attip(
			Attipoatendo attipoatendoBySgprefere2fk3attip) {
		this.attipoatendoBySgprefere2fk3attip = attipoatendoBySgprefere2fk3attip;
	}

	public Integer getCodsetat() {
		return this.codsetat;
	}

	public void setCodsetat(Integer codsetat) {
		this.codsetat = codsetat;
	}

	public Integer getCodfilialsa() {
		return this.codfilialsa;
	}

	public void setCodfilialsa(Integer codfilialsa) {
		this.codfilialsa = codfilialsa;
	}

	public Integer getCodempsa() {
		return this.codempsa;
	}

	public void setCodempsa(Integer codempsa) {
		this.codempsa = codempsa;
	}

	public Integer getCodsetat2() {
		return this.codsetat2;
	}

	public void setCodsetat2(Integer codsetat2) {
		this.codsetat2 = codsetat2;
	}

	public Integer getCodfilials2() {
		return this.codfilials2;
	}

	public void setCodfilials2(Integer codfilials2) {
		this.codfilials2 = codfilials2;
	}

	public Integer getCodemps2() {
		return this.codemps2;
	}

	public void setCodemps2(Integer codemps2) {
		this.codemps2 = codemps2;
	}

	public String getClassmedida() {
		return this.classmedida;
	}

	public void setClassmedida(String classmedida) {
		this.classmedida = classmedida;
	}

	public String getCabtermr01() {
		return this.cabtermr01;
	}

	public void setCabtermr01(String cabtermr01) {
		this.cabtermr01 = cabtermr01;
	}

	public String getCabtermr02() {
		return this.cabtermr02;
	}

	public void setCabtermr02(String cabtermr02) {
		this.cabtermr02 = cabtermr02;
	}

	public String getRodtermr() {
		return this.rodtermr;
	}

	public void setRodtermr(String rodtermr) {
		this.rodtermr = rodtermr;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
