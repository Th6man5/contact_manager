/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package contact.manager;

/**
 * Kelas Contact adalah class yang digunakan untuk menyimpan informasi kontak
 * seperti nama, nomor telepon, email, jabatan, dan perusahaan.
 * 
 * @author Raihan
 */
public class Contact {
    // Deklarasi atribut
    private String name;
    private String phone_numb;
    private String email;
    private String job_title;
    private String company;

    /**
     * Konstruktor untuk membuat objek Contact dengan semua informasi lengkap.
     * 
     * @param name Nama kontak
     * @param phone_numb Nomor telepon kontak
     * @param email Email kontak
     * @param job_title Jabatan kontak
     * @param company Perusahaan tempat kontak bekerja
     */
    public Contact(String name, String phone_numb, String email, String job_title, String company) {
        this.name = name;
        this.phone_numb = phone_numb;
        this.email = email;
        this.job_title = job_title;
        this.company = company;
    }

    /**
     * Mengembalikan nama kontak.
     * 
     * @return Nama kontak
     */
    public String getName() {
        return name;
    }

    /**
     * Mengatur nama kontak.
     * 
     * @param name Nama baru yang akan diatur untuk kontak
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mengembalikan nomor telepon kontak.
     * 
     * @return Nomor telepon kontak
     */
    public String getPhone_numb() {
        return phone_numb;
    }

    /**
     * Mengatur nomor telepon kontak.
     * 
     * @param phone_numb Nomor telepon baru yang akan diatur untuk kontak
     */
    public void setPhone_numb(String phone_numb) {
        this.phone_numb = phone_numb;
    }

    /**
     * Mengembalikan email kontak.
     * 
     * @return Email kontak
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengatur email kontak.
     * 
     * @param email Email baru yang akan diatur untuk kontak
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mengembalikan jabatan kontak.
     * 
     * @return Jabatan kontak
     */
    public String getJob_title() {
        return job_title;
    }

    /**
     * Mengatur jabatan kontak.
     * 
     * @param job_title Jabatan baru yang akan diatur untuk kontak
     */
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    /**
     * Mengembalikan nama perusahaan tempat kontak bekerja.
     * 
     * @return Nama perusahaan kontak
     */
    public String getCompany() {
        return company;
    }

    /**
     * Mengatur nama perusahaan kontak.
     * 
     * @param company Nama perusahaan baru yang akan diatur untuk kontak
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Mengembalikan representasi String dari objek Contact.
     * 
     * @return String yang merepresentasikan informasi kontak termasuk nama, nomor telepon, email, jabatan, dan perusahaan
     */
    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", phone_numb=" + phone_numb + ", email=" + email + ", job_title=" + job_title + ", company=" + company + '}';
    }
}
