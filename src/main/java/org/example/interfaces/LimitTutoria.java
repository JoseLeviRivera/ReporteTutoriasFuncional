package org.example.interfaces;

import org.example.Model.Tutoria;

import java.util.List;

public interface LimitTutoria extends OrderSuperior{
    List<Tutoria> limit(Integer l);
}
