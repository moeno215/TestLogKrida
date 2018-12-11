package com.example.maulana.testlogkrida.remote;

import com.example.maulana.testlogkrida.models.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {


    @GET("Krida-Dev/lovs/isotorise/rahman/03091973")
    Call <ResponseLogin> getLogin();
}
