package com.example.mvvm_practica.viewModels;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm_practica.BR;
import com.example.mvvm_practica.Models.User;

public class UserViewModel extends BaseObservable {

    private User user;

    public UserViewModel(){
        user = new User("","","");
    }
    public void setUserNombre(String name){
        user.setNombre(name);
        notifyPropertyChanged(BR.userNombre);
    }
    public void setUserCorreo(String email){
        user.setCorreo(email);
        notifyPropertyChanged(BR.userCorreo);
    }
    public void setUserEdad(String edad){
        user.setEdad(edad);
        notifyPropertyChanged(BR.userEdad);
    }

    @Bindable
    public String getUserNombre() {return user.getNombre();}
    @Bindable
    public String getUserCorreo() {return user.getCorreo();}
    @Bindable
    public String getUserEdad() {return user.getEdad();}
}
