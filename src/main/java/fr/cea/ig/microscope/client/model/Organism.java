package fr.cea.ig.microscope.client.model;


public class Organism {
    private String  oGram;
    private String  oStrain;
    private String  oSynonym;
    private int     oTaxon;
    private String  oName;
    private String  oKingdom;
    private String  oSpeciesCode;
    private int     oReplicNb;
    private String  oDirname;
    private int     oId;

    public String getoGram() {
        return oGram;
    }

    public void setoGram(final String oGram) {
        this.oGram = oGram;
    }

    public String getoStrain() {
        return oStrain;
    }

    public void setoStrain(final String oStrain) {
        this.oStrain = oStrain;
    }

    public String getoSynonym() {
        return oSynonym;
    }

    public void setoSynonym(final String oSynonym) {
        this.oSynonym = oSynonym;
    }

    public int getoTaxon() {
        return oTaxon;
    }

    public void setoTaxon(final int oTaxon) {
        this.oTaxon = oTaxon;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(final String oName) {
        this.oName = oName;
    }

    public String getoKingdom() {
        return oKingdom;
    }

    public void setoKingdom(final String oKingdom) {
        this.oKingdom = oKingdom;
    }

    public String getoSpeciesCode() {
        return oSpeciesCode;
    }

    public void setoSpeciesCode(final String oSpeciesCode) {
        this.oSpeciesCode = oSpeciesCode;
    }

    public int getoReplicNb() {
        return oReplicNb;
    }

    public void setoReplicNb(final int oReplicNb) {
        this.oReplicNb = oReplicNb;
    }

    public String getoDirname() {
        return oDirname;
    }

    public void setoDirname(final String oDirname) {
        this.oDirname = oDirname;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(final int oId) {
        this.oId = oId;
    }
}
