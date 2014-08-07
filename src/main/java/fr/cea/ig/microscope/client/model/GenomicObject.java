package fr.cea.ig.microscope.client.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import java.io.Serializable;
import java.util.Date;

public class GenomicObject implements Serializable {
    private static final long serialVersionUID = -1L;
    private String  goAutomaticUpdate;
    private String  goMutation;
    private String  goStatus;
    private String  goLocalization;
    private String  goPmid;
    private String  goProcess;
    private String  goAmigaStatus;
    private String  goUpdate;
    private int     sId;
    private String  goFrame;
    private String  goType;
    private String  goNote;
    private String  goProductType;
    private int     goBegin;
    private String  goProduct;
    private int     goEnd;
    private String  goEc;
    private int     caId;
    private String  goFunction;
    private int     goLength;
    private int     goOriId;
    private String  goLabel;
    private int     goId;
    private String  goLocation;
    private String  goComments;
    private String  goEvidence;
    private String  goSynonyms;
    private int     aId;
    private String  goReaction;
    private String  goGeneName;
    @JsonSerialize(using=DateSerializer.class)
    private Date    goCreationDate;
    private String  goClass;

    public String getGoAutomaticUpdate() {
        return goAutomaticUpdate;
    }

    public void setGoAutomaticUpdate(final String goAutomaticUpdate) {
        this.goAutomaticUpdate = goAutomaticUpdate;
    }

    public String getGoMutation() {
        return goMutation;
    }

    public void setGoMutation(final String goMutation) {
        this.goMutation = goMutation;
    }

    public String getGoStatus() {
        return goStatus;
    }

    public void setGoStatus(final String goStatus) {
        this.goStatus = goStatus;
    }

    public String getGoLocalization() {
        return goLocalization;
    }

    public void setGoLocalization(final String goLocalization) {
        this.goLocalization = goLocalization;
    }

    public String getGoPmid() {
        return goPmid;
    }

    public void setGoPmid(final String goPmid) {
        this.goPmid = goPmid;
    }

    public String getGoProcess() {
        return goProcess;
    }

    public void setGoProcess(final String goProcess) {
        this.goProcess = goProcess;
    }

    public String getGoAmigaStatus() {
        return goAmigaStatus;
    }

    public void setGoAmigaStatus(final String goAmigaStatus) {
        this.goAmigaStatus = goAmigaStatus;
    }

    public String getGoUpdate() {
        return goUpdate;
    }

    public void setGoUpdate(final String goUpdate) {
        this.goUpdate = goUpdate;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(final int sId) {
        this.sId = sId;
    }

    public String getGoFrame() {
        return goFrame;
    }

    public void setGoFrame(final String goFrame) {
        this.goFrame = goFrame;
    }

    public String getGoType() {
        return goType;
    }

    public void setGoType(final String goType) {
        this.goType = goType;
    }

    public String getGoNote() {
        return goNote;
    }

    public void setGoNote(final String goNote) {
        this.goNote = goNote;
    }

    public String getGoProductType() {
        return goProductType;
    }

    public void setGoProductType(String goProductType) {
        this.goProductType = goProductType;
    }

    public int getGoBegin() {
        return goBegin;
    }

    public void setGoBegin(final int goBegin) {
        this.goBegin = goBegin;
    }

    public String getGoProduct() {
        return goProduct;
    }

    public void setGoProduct(final String goProduct) {
        this.goProduct = goProduct;
    }

    public int getGoEnd() {
        return goEnd;
    }

    public void setGoEnd(final int goEnd) {
        this.goEnd = goEnd;
    }

    public String getGoEc() {
        return goEc;
    }

    public void setGoEc(final String goEc) {
        this.goEc = goEc;
    }

    public int getCaId() {
        return caId;
    }

    public void setCaId(final int caId) {
        this.caId = caId;
    }

    public String getGoFunction() {
        return goFunction;
    }

    public void setGoFunction(final String goFunction) {
        this.goFunction = goFunction;
    }

    public int getGoLength() {
        return goLength;
    }

    public void setGoLength(final int goLength) {
        this.goLength = goLength;
    }

    public int getGoOriId() {
        return goOriId;
    }

    public void setGoOriId(final int goOriId) {
        this.goOriId = goOriId;
    }

    public String getGoLabel() {
        return goLabel;
    }

    public void setGoLabel(final String goLabel) {
        this.goLabel = goLabel;
    }

    public int getGoId() {
        return goId;
    }

    public void setGoId(final int goId) {
        this.goId = goId;
    }

    public String getGoLocation() {
        return goLocation;
    }

    public void setGoLocation(final String goLocation) {
        this.goLocation = goLocation;
    }

    public String getGoComments() {
        return goComments;
    }

    public void setGoComments(final String goComments) {
        this.goComments = goComments;
    }

    public String getGoEvidence() {
        return goEvidence;
    }

    public void setGoEvidence(final String goEvidence) {
        this.goEvidence = goEvidence;
    }

    public String getGoSynonyms() {
        return goSynonyms;
    }

    public void setGoSynonyms(final String goSynonyms) {
        this.goSynonyms = goSynonyms;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(final int aId) {
        this.aId = aId;
    }

    public String getGoReaction() {
        return goReaction;
    }

    public void setGoReaction(final String goReaction) {
        this.goReaction = goReaction;
    }

    public String getGoGeneName() {
        return goGeneName;
    }

    public void setGoGeneName(final String goGeneName) {
        this.goGeneName = goGeneName;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getGoCreationDate() {
        return goCreationDate;
    }

    public void setGoCreationDate(final Date goCreationDate) {
        this.goCreationDate = goCreationDate;
    }

    public String getGoClass() {
        return goClass;
    }

    public void setGoClassfinal (String goClass) {
        this.goClass = goClass;
    }
}
