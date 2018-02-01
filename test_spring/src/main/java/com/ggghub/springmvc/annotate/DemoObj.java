package com.ggghub.springmvc.annotate;

/**
 * Created by LiSiYuan on 2018/2/1.
 */
public class DemoObj {
    private Long id;
    private String name;

    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public DemoObj(){
        super();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
