package com.example.ahmed.bfreshersappsql;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ahmed on 09/03/2018.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://brunelfreshersapp.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String email, int age, String password, Response.Listener<String> listener)
    {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("email",email);
        params.put("password",password);
        params.put("age",age + "");

    }
    @Override
    public Map<String, String> getParams() {

        return params;
    }
}

