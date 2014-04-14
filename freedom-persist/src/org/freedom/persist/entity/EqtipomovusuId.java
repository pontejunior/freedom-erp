package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * EqtipomovusuId generated by hbm2java
 */
public class EqtipomovusuId implements java.io.Serializable {

	private int codtipomov;
	private short codfilial;
	private int codemp;
	private String idusu;
	private short codfilialus;
	private int codempus;

	public EqtipomovusuId() {
	}

	public EqtipomovusuId(int codtipomov, short codfilial, int codemp,
			String idusu, short codfilialus, int codempus) {
		this.codtipomov = codtipomov;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.idusu = idusu;
		this.codfilialus = codfilialus;
		this.codempus = codempus;
	}

	public int getCodtipomov() {
		return this.codtipomov;
	}

	public void setCodtipomov(int codtipomov) {
		this.codtipomov = codtipomov;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public String getIdusu() {
		return this.idusu;
	}

	public void setIdusu(String idusu) {
		this.idusu = idusu;
	}

	public short getCodfilialus() {
		return this.codfilialus;
	}

	public void setCodfilialus(short codfilialus) {
		this.codfilialus = codfilialus;
	}

	public int getCodempus() {
		return this.codempus;
	}

	public void setCodempus(int codempus) {
		this.codempus = codempus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqtipomovusuId))
			return false;
		EqtipomovusuId castOther = (EqtipomovusuId) other;

		return (this.getCodtipomov() == castOther.getCodtipomov())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& ((this.getIdusu() == castOther.getIdusu()) || (this
						.getIdusu() != null && castOther.getIdusu() != null && this
						.getIdusu().equals(castOther.getIdusu())))
				&& (this.getCodfilialus() == castOther.getCodfilialus())
				&& (this.getCodempus() == castOther.getCodempus());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtipomov();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result
				+ (getIdusu() == null ? 0 : this.getIdusu().hashCode());
		result = 37 * result + this.getCodfilialus();
		result = 37 * result + this.getCodempus();
		return result;
	}

}
