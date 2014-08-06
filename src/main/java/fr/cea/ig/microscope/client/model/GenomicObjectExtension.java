package fr.cea.ig.grools.microscope;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import java.io.Serializable;
import java.util.Date;

public class GenomicObjectExtension implements Serializable {
    private static final long serialVersionUID = -1L;

    private String          goTypeE;
    private String          goSynonymsE;
    private String          goStatusE;
    private String          goAmigeneStatusE;
    private GenomicObject   genomicObject;
    private int             goOriIdE;
    private String          goProductTypeE;
    private int             goEndE;
    private String          goLabelE;
    private String          goPmidE;
    private int             goLengthE;
    private String          goGeneNameE;
    private String          goLocalizationE;
    private int             goOriId;
    private String          goFunctionE;
    private String          protId;
    private String          goEcE;
    private int             goBeginE;
    private String          goFrameE;
    private String          goProcessE;
    private int             refSeq;
    private String          goEvidenceE;
    @JsonSerialize(using=DateSerializer.class)
    private Date            goCreationDateE;
    private String          goClassE;
    private String          goProductE;
    private String          goMutationE;
    private String          trembl;
    private String          uniprot;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGoTypeE() {
        return goTypeE;
    }

    public void setGoTypeE(final String goTypeE) {
        this.goTypeE = goTypeE;
    }

    public String getGoSynonymsE() {
        return goSynonymsE;
    }

    public void setGoSynonymsE(final String goSynonymsE) {
        this.goSynonymsE = goSynonymsE;
    }

    public String getGoStatusE() {
        return goStatusE;
    }

    public void setGoStatusE(final String goStatusE) {
        this.goStatusE = goStatusE;
    }

    public String getGoAmigeneStatusE() {
        return goAmigeneStatusE;
    }

    public void setGoAmigeneStatusE(final String goAmigeneStatusE) {
        this.goAmigeneStatusE = goAmigeneStatusE;
    }

    public GenomicObject getGenomicObject() {
        return genomicObject;
    }

    public void setGenomicObject(final GenomicObject genomicObject) {
        this.genomicObject = genomicObject;
    }

    public int getGoOriIdE() {
        return goOriIdE;
    }

    public void setGoOriIdE(final int goOriIdE) {
        this.goOriIdE = goOriIdE;
    }

    public String getGoProductTypeE() {
        return goProductTypeE;
    }

    public void setGoProductTypeE(final String goProductTypeE) {
        this.goProductTypeE = goProductTypeE;
    }

    public int getGoEndE() {
        return goEndE;
    }

    public void setGoEndE(final int goEndE) {
        this.goEndE = goEndE;
    }

    public String getGoLabelE() {
        return goLabelE;
    }

    public void setGoLabelE(final String goLabelE) {
        this.goLabelE = goLabelE;
    }

    public String getGoPmidE() {
        return goPmidE;
    }

    public void setGoPmidE(final String goPmidE) {
        this.goPmidE = goPmidE;
    }

    public int getGoLengthE() {
        return goLengthE;
    }

    public void setGoLengthE(final int goLengthE) {
        this.goLengthE = goLengthE;
    }

    public String getGoGeneNameE() {
        return goGeneNameE;
    }

    public void setGoGeneNameE(final String goGeneNameE) {
        this.goGeneNameE = goGeneNameE;
    }

    public String getGoLocalizationE() {
        return goLocalizationE;
    }

    public void setGoLocalizationE(final String goLocalizationE) {
        this.goLocalizationE = goLocalizationE;
    }

    public int getGoOriId() {
        return goOriId;
    }

    public void setGoOriId(final int goOriId) {
        this.goOriId = goOriId;
    }

    public String getGoFunctionE() {
        return goFunctionE;
    }

    public void setGoFunctionE(final String goFunctionE) {
        this.goFunctionE = goFunctionE;
    }

    public String getProtId() {
        return protId;
    }

    public void setProtId(final String protId) {
        this.protId = protId;
    }

    public String getGoEcE() {
        return goEcE;
    }

    public void setGoEcE(final String goEcE) {
        this.goEcE = goEcE;
    }

    public int getGoBeginE() {
        return goBeginE;
    }

    public void setGoBeginE(final int goBeginE) {
        this.goBeginE = goBeginE;
    }

    public String getGoFrameE() {
        return goFrameE;
    }

    public void setGoFrameE(final String goFrameE) {
        this.goFrameE = goFrameE;
    }

    public String getGoProcessE() {
        return goProcessE;
    }

    public void setGoProcessE(final String goProcessE) {
        this.goProcessE = goProcessE;
    }

    public int getRefSeq() {
        return refSeq;
    }

    public void setRefSeq(final int refSeq) {
        this.refSeq = refSeq;
    }

    public String getGoEvidenceE() {
        return goEvidenceE;
    }

    public void setGoEvidenceE(final String goEvidenceE) {
        this.goEvidenceE = goEvidenceE;
    }
    @JsonSerialize(using=DateSerializer.class)
    public Date getGoCreationDateE() {
        return goCreationDateE;
    }

    public void setGoCreationDateE(final Date goCreationDateE) {
        this.goCreationDateE = goCreationDateE;
    }

    public String getGoClassE() {
        return goClassE;
    }

    public void setGoClassE(final String goClassE) {
        this.goClassE = goClassE;
    }

    public String getGoProductE() {
        return goProductE;
    }

    public void setGoProductE(final String goProductE) {
        this.goProductE = goProductE;
    }

    public String getGoMutationE() {
        return goMutationE;
    }

    public void setGoMutationE(String goMutationE) {
        this.goMutationE = goMutationE;
    }

    public String getTrembl() {
        return trembl;
    }

    public void setTrembl(final String trembl) {
        this.trembl = trembl;
    }

    public String getUniprot() {
        return uniprot;
    }

    public void setUniprot(final String uniprot) {
        this.uniprot = uniprot;
    }

}
