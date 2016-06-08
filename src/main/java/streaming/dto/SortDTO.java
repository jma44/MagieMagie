/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dto;

/**
 *
 * @author ajc
 */
public class SortDTO 
{
    private Long victimeId;
    
    private Long ing1Id;
    
    private Long ing2Id;

    public Long getVictimeId() {
        return victimeId;
    }

    public void setVictimeId(Long victimeId) {
        this.victimeId = victimeId;
    }

    public Long getIng1Id() {
        return ing1Id;
    }

    public void setIng1Id(Long ing1Id) {
        this.ing1Id = ing1Id;
    }

    public Long getIng2Id() {
        return ing2Id;
    }

    public void setIng2Id(Long ing2Id) {
        this.ing2Id = ing2Id;
    }

}
