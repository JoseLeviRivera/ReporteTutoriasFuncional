package org.example.interfaces;

import org.example.Model.Profesor;

import java.util.List;

public interface LimitProfesor extends  OrderSuperior{
    List<Profesor> limit(Integer limit);
}
