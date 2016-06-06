/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Sortilege;

/**
 *
 * @author ajc
 */
public interface SortilegeCrudService extends CrudRepository<Sortilege, Long>
{
    
}
