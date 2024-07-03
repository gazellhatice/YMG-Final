

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
/**
 *
 * @author Matti
 */
@ManagedBean(name = "userInfoBean", eager = true)
@RequestScoped
public class UserInfoBean {
    private String name;
    private String address;
    private String email;
    private String phone;
    
    public UserInfoBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
