package org.example.interfaces;

import org.example.Model.Tutor;
import java.util.List;

public interface LimitTutor extends OrderSuperior{
    List<Tutor> limitar(Integer limit);
}
