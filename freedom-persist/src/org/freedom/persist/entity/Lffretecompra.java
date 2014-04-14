package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Lffretecompra generated by hbm2java
 */
public class Lffretecompra implements java.io.Serializable {

	private LffretecompraId id;
	private Cpcompra cpcompra;
	private Lffrete lffrete;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Lffretecompra() {
	}

	public Lffretecompra(LffretecompraId id, Cpcompra cpcompra,
			Lffrete lffrete, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.lffrete = lffrete;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lffretecompra(LffretecompraId id, Cpcompra cpcompra,
			Lffrete lffrete, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.cpcompra = cpcompra;
		this.lffrete = lffrete;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public LffretecompraId getId() {
		return this.id;
	}

	public void setId(LffretecompraId id) {
		this.id = id;
	}

	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	public Lffrete getLffrete() {
		return this.lffrete;
	}

	public void setLffrete(Lffrete lffrete) {
		this.lffrete = lffrete;
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
