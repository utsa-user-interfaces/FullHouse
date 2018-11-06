package com.canavast.www.home;

import static spark.Spark.*;

public class CanavastMain {
    public static void main(String[] args) {
        staticFiles.location("/public");
        get("/", (req, res) -> {
            res.redirect("index.html");
            return null;
        });
    }
}
