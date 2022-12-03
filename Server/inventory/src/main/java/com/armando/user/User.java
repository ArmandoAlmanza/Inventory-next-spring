package com.armando.user;

import java.util.Objects;

public class User {
    private Integer id;
    private String userName;
    private String email;
    private String imagePath;

    public User() {
    }

    public User(Integer id, String userName, String email, String imagePath) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.imagePath = imagePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(email, user.email) && Objects.equals(imagePath, user.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, email, imagePath);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
