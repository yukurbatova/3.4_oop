package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MovieItem {
    private int id;
    private String movieName;
    private String movieGenre;
    private boolean premiereTomorrow;
}
