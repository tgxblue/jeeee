package com.jeefw.model.sys;

import com.google.common.base.Objects;
import com.jeefw.model.sys.param.GongzuoliuParameter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * Created by ksoam on 2015/12/28.
 */
@Entity
@Table(name = "Gongzuoliu")
@Cache(region = "all", usage = CacheConcurrencyStrategy.READ_WRITE)
@JsonIgnoreProperties(value = { "maxResults", "firstResult", "topCount", "sortColumns", "cmd", "queryDynamicConditions", "sortedConditions", "dynamicProperties", "success", "message", "sortColumnsString", "flag" })
public class Gongzuoliu extends GongzuoliuParameter {

    // 各个字段的含义请查阅文档的数据库结构部分
    private static final long serialVersionUID = -2847988368314678488L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "dict_key", length = 20, nullable = false, unique = true)
    private String dictKey;
    @Column(name = "dict_value", length = 40, nullable = false)
    private String dictValue;
    @Column(name = "sequence")
    private Long sequence;
    @Column(name = "parent_dictkey", length = 20)
    private String parentDictkey;

    public Gongzuoliu() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getParentDictkey() {
        return parentDictkey;
    }

    public void setParentDictkey(String parentDictkey) {
        this.parentDictkey = parentDictkey;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Gongzuoliu other = (Gongzuoliu) obj;
        return Objects.equal(this.id, other.id) && Objects.equal(this.dictKey, other.dictKey) && Objects.equal(this.dictValue, other.dictValue) && Objects.equal(this.sequence, other.sequence)
                && Objects.equal(this.parentDictkey, other.parentDictkey);
    }

    public int hashCode() {
        return Objects.hashCode(this.id, this.dictKey, this.dictValue, this.sequence, this.parentDictkey);
    }
}
