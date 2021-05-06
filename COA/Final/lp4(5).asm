.MODEL SMALL
.STACK 100H
.DATA
 

.CODE

MAIN PROC
 
    MOV DL,'?'
    MOV AH,2
    INT 21H
 
    MOV AH,1      
                  
    INT 21H      
    MOV BL,AL    
                  
    INT 21H       
    MOV CL,AL
 
    MOV AH,2     
    MOV DL,0AH    
    INT 21H       
    MOV DL,0DH    
    INT 21H       
                  
    CMP BL,CL
         
    JLE FIRST
         
    MOV AH,2      
    MOV DL,CL     
    INT 21H
           
    ;JMP END_ 
         
    FIRST:        
        MOV AH,2  
        MOV DL,BL 
        INT 21H   
                  
    END_:
 
    MOV AH,4CH   
    INT 21H     
    
       
    MAIN ENDP
END MAIN