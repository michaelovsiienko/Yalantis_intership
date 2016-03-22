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
public class dataclass {
    private String code_app;
    private String name;
    private String status;
    private String created;
    private String registered;
    private String solve_to;
    private String responsible;
    private String description;
    private String responsible_object;

    private String created_time;
    private String registered_time;
    private String solve_to_time;
    public void setCode_app (String _code_app)
    {
        this.code_app = _code_app;
    }
    public String getCode_app ()
    {
        return this.code_app;
    }

    public  void setName (String _name)
    {
        this.name = _name;
    }
    public String getName ()
    {
        return this.name;
    }
    public void setStatus (String _status)
    {
        this.status = _status;
    }
    public String getStatus ()
    {
        return this.status;
    }
    public void setCreated (String _created)
    {
        this.created = _created;
    }
    public String getCreated ()
    {
        return this.created;
    }
    public void setRegistered (String _registered)
    {
        this.registered = _registered;
    }
    public String getRegistered ()
    {
        return this.registered;
    }

    public  void setSolve_to (String _solve_to)
    {
        this.solve_to = _solve_to;
    }
    public String getSolve_to ()
    {
        return this.solve_to;
    }
    public void setResponsible (String _responsible)
    {
        this.responsible = _responsible;
    }
    public String getResponsible ()
    {
        return this.responsible;
    }
    public void setDescription (String _description)
    {
        this.description = _description;
    }
    public String getDescription ()
    {
        return this.description;
    }
    public  void setResponsible_object (String _responsible_object)
    {
        this.responsible_object = _responsible_object;
    }
    public String getResponsible_object ()
    {
        return this.responsible_object;
    }
    public  String getCreated_time (Date date)
    {
        return new SimpleDateFormat("dd MMMM y", Locale.getDefault()).format(date);
    }
    public String getRegistered_time (Date date )
    {
        return new SimpleDateFormat("dd MMMM y", Locale.getDefault()).format(date);
    }
    public String getSolve_to_time (Date date, int days)
    {
        Calendar cal =  Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        date = cal.getTime();
        return new SimpleDateFormat("dd MMMM y", Locale.getDefault()).format(date);
    }
    public List<String> getimageurls() {
        List<String> mylist = new ArrayList<>();
        mylist.add("http://bm.img.com.ua/nxs/img/prikol/images/large/9/8/310889.jpg");
        mylist.add("http://bm.img.com.ua/nxs/img/prikol/images/large/6/5/310856.jpg");
        mylist.add("http://bm.img.com.ua/nxs/img/prikol/images/large/1/4/310841.jpg");
        return mylist;
    }


}
