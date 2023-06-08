package ecommerce.lbmat.mongo.services;

import ecommerce.lbmat.mongo.entities.Caddie;

import java.util.List;

public interface CaddieService {
    Caddie create(Caddie caddie);
    Caddie read(String id);
    List<Caddie> readAll();
    Caddie update(Caddie caddie);
}
