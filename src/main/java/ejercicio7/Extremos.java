/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.List;


public interface Extremos<T> {
    T mini(List<T> a);
    T max(List<T> a);
}
