package com.yalantis_intership;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Class which contains methods and info for show data on display
 */
public class DataClass {
    private String mCode;
    private String mName;
    private String mStatus;
    private String mCreated;
    private String mRegistered;
    private String mSolve;
    private String mResponsible;
    private String mDescription;
    private String mResponsibleObj;
    private List<String> mImgList = new ArrayList<>();

    public void setCode(String _code_app) {
        this.mCode = _code_app;
    }

    public String getCode() {
        return this.mCode;
    }

    public void setName(String _name) {
        this.mName = _name;
    }

    public String getName() {
        return this.mName;
    }

    public void setStatus(String _status) {
        this.mStatus = _status;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public void setCreated(String _created) {
        this.mCreated = _created;
    }

    public String getCreated() {
        return this.mCreated;
    }

    public void setRegistered(String _registered) {
        this.mRegistered = _registered;
    }

    public String getRegistered() {
        return this.mRegistered;
    }

    public String getDateType() {
        return "dd MMMM y";
    }

    public void setSolve_to(String _solve_to) {
        this.mSolve = _solve_to;
    }

    public String getSolve_to() {
        return this.mSolve;
    }

    public void setResponsible(String _responsible) {
        this.mResponsible = _responsible;
    }

    public String getResponsible() {
        return this.mResponsible;
    }

    public void setDescription(String _description) {
        this.mDescription = _description;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setResponsible_object(String _responsible_object) {
        this.mResponsibleObj = _responsible_object;
    }

    public String getResponsible_object() {
        return this.mResponsibleObj;
    }

    public String getCreated_time(Date date) {
        return new SimpleDateFormat(getDateType(), Locale.getDefault()).format(date);
    }

    public String getRegistered_time(Date date) {
        return new SimpleDateFormat(getDateType(), Locale.getDefault()).format(date);
    }

    public String getSolve_to_time(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        date = cal.getTime();
        return new SimpleDateFormat(getDateType(), Locale.getDefault()).format(date);
    }

    public void setImgUrls(List<String> nImgList) {
        this.mImgList = nImgList;
    }

    public List<String> getImgUrls() {
        return mImgList;
    }


}
