package com.mojafirma;
import com.mojafirma.entity.Movie;
import com.mojafirma.entity.dao.MovieDAO;
import java.sql.Date;

public class MovieApp {
    public static void main(String[] args) {
        MovieDAO movieDAO = new MovieDAO();
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDuration(120);
        matrix.setYear(Date.valueOf("1990-01-01"));
        matrix.setDirector("Wachowsky Brothers");

        movieDAO.addMovie(matrix);
    }

}
