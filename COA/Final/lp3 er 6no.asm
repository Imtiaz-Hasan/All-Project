 .model small
.stack 100h
.data 

a db ' zero $'
b db ' positive $'
c db ' negative $'     

.code
main proc 
    mov ax,@data
    mov ds,ax
    
    mov ah,1
    int 21h



cmp al,'0'     
je l1      
jg l2      
jl l3        

l1:
lea dx,a
mov ah,9
int 21h 

jmp exit

l2:
lea dx,b
mov ah,9
int 21h 

jmp exit
       
l3:
lea dx,c
mov ah,9
int 21h 

jmp exit      
    
exit:
mov ah,4ch
int 21h

main endp
end main

