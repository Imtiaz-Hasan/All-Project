
;1
.MODEL SMALL
.STACK 100H
.DATA
a DB 'Welcome User!! $'
b DB 'Please User Enter Letter 1: $'        
c DB 'Please User Enter Letter 2: $'
d DB 'Please User Enter Letter 3: $'
e DB 'Output: $'
.CODE
MAIN PROC
    mov ax,@data
    mov ds,ax
   
    lea dx,a  
    mov ah,9
    int 21h
   
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,b
    mov ah,9
    int 21h
    mov ah,1
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,c
    mov ah,9
    int 21h
    mov ah,1
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,d
    mov ah,9
    int 21h
    mov ah,1
    int 21h  
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
   
    lea dx,e
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    mov ah,2
    mov dl,'J'
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h  
   
     mov ah,2
    mov dl,'F'
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
     mov ah,2
    mov dl,'K'
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    mov ah,4ch
    int 21h
   
   
    main endp
end main


 ;2.  
.model small
.stack 100h
.data
a db 'Welcome To My Calculator!! $'
b db 'Please User Enter The Number 5: $'        
c db 'Twos Complement Of 5: $'
d db 'Twos Complement Of Twos Complement Of 5: $'
e db 'Thank You For Using My Calculator $'
f db 'Have a good day $'
.code
main proc
    mov ax,@data
    mov ds,ax
   
    lea dx,a  
    mov ah,9
    int 21h
   
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,b
    mov ah,9
    int 21h
    mov ah,1
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,c
    mov ah,9
    int 21h
    mov ah,1
    int 21h
    int 21h
   
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,d
    mov ah,9
    int 21h
    mov ah,1
    int 21h  
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
   
    lea dx,e
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,f
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    mov ah,4ch
    int 21h
   
   
    main endp
end main






;lab-3....

.model small
.stack 100h
.data
a db 'Welcome To My Calculator!! $'
b db 'Please User Enter A Hex Digit(A-F): $'        
c db 'In Decimal is:10 $'
d db 'Thank You For Using My Calculator $'
e db 'Have a Good Day $'
.code
main proc
    mov ax,@data
    mov ds,ax
   
    lea dx,a  
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
   
    lea dx,b
    mov ah,9
    int 21h
    mov ah,1
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,c
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
    lea dx,d
    mov ah,9
    int 21h
   
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
   
    lea dx,e
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h
   
   
   
    mov ah,4ch
    int 21h
   
   
    main endp
end main



;LAB -5
.model small
.stack 100h
.data
a db 'Take a Capital Letter:a $'
b db 'Convert to Small Letter:$'        

.code
main proc
    mov ax,@data
    mov ds,ax
   
    lea dx,a  
    mov ah,9
    int 21h
   
    mov dl,0ah
    mov ah,2
    int 21h
     
    mov dl,0dh
    mov ah,2
    int 21h  
   
    lea dx,b
    mov ah,9
    int 21h
    mov ah,2
    mov al,41h
    mov dl,al
    int 21h
   
   
    mov ah,4ch
    int 21h
   
   
    main endp
end main



 dx,a  
    mov ah,9
    int 21h  
   
     mov ax,@data
    mov ds,ax
   
    lea dx,b  
    mov ah,9
    int 21h
     mov ax,@data
    mov ds,ax
   
    lea dx,c
    mov ah,9
    int 21h
   
   
   
    mov ah,4ch
    int 21h
   
    main endp
end main
   
4..model small
.stack 100h
.data
a db '***',0dh,0ah,'$'  
b db '*a*',0dh,0ah,'$'
c db '***',0dh,0ah,'$'
.code
main proc
    mov ax,@data
    mov ds,ax
   
    lea dx,a  
    mov ah,9
    int 21h  
   
     mov ax,@data
    mov ds,ax
   
    lea dx,b  
    mov ah,9
    int 21h
     mov ax,@data
    mov ds,ax
   
    lea dx,c
    mov ah,9
    int 21h
   
   
   
    mov ah,4ch
    int 21h
   
    main endp
end main








;LAB-4
.MODEL SMALL
.STACK 100H
.DATA
A DB 'Enter small Letter: $'
B DB 'Capital Letter of it is: $'

.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
   
    ;A
    LEA DX,A
    MOV AH,9
    INT 21H
   
    MOV DL,0AH
    MOV AH,2
    INT 21H
    MOV DL,0DH
    MOV AH,2
    INT 21H
   
    MOV AH,1
    INT 21H
    MOV BL,AL
   
    MOV DL,0AH
    MOV AH,2
    INT 21H
    MOV DL,0DH
    MOV AH,2
    INT 21H
   
             
    ;B
    LEA DX,B
    MOV AH,9
    INT 21H
   
    MOV DL,0AH
    MOV AH,2
    INT 21H
    MOV DL,0DH
    MOV AH,2
    INT 21H
   
    MOV AH,2
    SUB BL,38
    ADD BL,6
    MOV DL,BL
    INT 21H
   
   
    MOV DL,0AH
    MOV AH,2
    INT 21H
    MOV DL,0DH
    MOV AH,2
    INT 21H
   
   
    MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN



;LAB-5

.MODEL SMALL
.STACK 100H
.DATA
  A DB ? 

.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX 
    
    MOV AH,1
    INT 21H
    
    MOV A,AL
    
    MOV AH,2
    MOV DL,AL
   
    
    
    INT 21H
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H
    
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    MOV AH,2
    MOV DL,AL
    INT 21H
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H
    
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    MOV AH,2
    MOV DL,AL
    INT 21H
    INT 21H
    
    
    MOV AH,4CH
    INT 21H
    
    MAIN ENDP 
END MAIN
