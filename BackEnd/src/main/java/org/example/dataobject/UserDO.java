package org.example.dataobject;

import java.util.Date;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.name
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.gender
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.birthday
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.intro
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private String intro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.weight
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.height
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer height;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.avoidance
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer avoidance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.budget
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer budget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.state
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.name
     *
     * @return the value of user_info.name
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.name
     *
     * @param name the value for user_info.name
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.birthday
     *
     * @return the value of user_info.birthday
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.birthday
     *
     * @param birthday the value for user_info.birthday
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.intro
     *
     * @return the value of user_info.intro
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.intro
     *
     * @param intro the value for user_info.intro
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.weight
     *
     * @return the value of user_info.weight
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.weight
     *
     * @param weight the value for user_info.weight
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.height
     *
     * @return the value of user_info.height
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.height
     *
     * @param height the value for user_info.height
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.avoidance
     *
     * @return the value of user_info.avoidance
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getAvoidance() {
        return avoidance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.avoidance
     *
     * @param avoidance the value for user_info.avoidance
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setAvoidance(Integer avoidance) {
        this.avoidance = avoidance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.budget
     *
     * @return the value of user_info.budget
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getBudget() {
        return budget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.budget
     *
     * @param budget the value for user_info.budget
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.state
     *
     * @return the value of user_info.state
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.state
     *
     * @param state the value for user_info.state
     *
     * @mbg.generated Tue Nov 01 00:12:38 CST 2022
     */
    public void setState(Integer state) {
        this.state = state;
    }
}