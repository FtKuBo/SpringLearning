package org.mehdi.userProfileApi.api;

public class WelcomeDto {
    public String status;
    public String welcomeMessage;

    WelcomeDto(){
        this.status = "green";
        this.welcomeMessage = "Allah Akbar";
    }
}
