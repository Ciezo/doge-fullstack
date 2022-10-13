package com.rijai.LocationApi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="cities")
public class City {
    @Id    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String country;
    private String name;
    private String population;
    private String mayor;

    public City() {
    }

    public City(long id, String country, String name, String population, String mayor) {
        this.id = id;
        this.country = country;
        this.name = name;
        this.population = population;
        this.mayor = mayor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {this.country = country;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.country);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.population);
        hash = 79 * hash + Objects.hashCode(this.mayor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (!Objects.equals(this.mayor, other.mayor)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", country='").append(country).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", population='").append(population).append('\'');
        sb.append(", mayor=").append(mayor);
        sb.append('}');
        return sb.toString();
    }

}