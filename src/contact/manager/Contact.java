/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact.manager;

/**
 *
 * @author Raihan
 */

/*
Refrensi parameter kontak: intouchapp
*/
public class Contact {
    private String name;
    private String phone_numb;
    private String email;
    private String job_title;
    private String company;

    public Contact(String name, String phone_numb, String email, String job_title, String company) {
        this.name = name;
        this.phone_numb = phone_numb;
        this.email = email;
        this.job_title = job_title;
        this.company = company;
    }

    public Contact(String name, String phone_numb) {
        this.name = name;
        this.phone_numb = phone_numb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_numb() {
        return phone_numb;
    }

    public void setPhone_numb(String phone_numb) {
        this.phone_numb = phone_numb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", phone_numb=" + phone_numb + ", email=" + email + ", job_title=" + job_title + ", company=" + company + '}';
    }
    
    
}
