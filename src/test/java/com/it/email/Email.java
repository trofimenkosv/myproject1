package com.it.email;

import java.util.Objects;

public class Email {

   public String emailRecipient;
   public String subject;
   public String body;

    public Email(String email, String emailRecipient, String subject, String body) {
        this.emailRecipient = emailRecipient;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(emailRecipient, email.emailRecipient) &&
                Objects.equals(subject, email.subject) &&
                Objects.equals(body, email.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailRecipient, subject, body);
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailRecipient='" + emailRecipient + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}








