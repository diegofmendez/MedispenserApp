# MedispenserApp
El proyecto correspondiente al programa es el titulado "MedispenserFinalProject.zip"

# Equipo
- Gabriella Ballesteros
- Diego Mendez

# ¿Qué es medispenser?
Medispenser es un dispensador de medicamentos vinculado a una applicacion para escritorio, esta app permite al usuario ingresar los nombres de los medicamentos, los tiempos de administración de cada uno, con esta información, se hace una conexión con arduino con el fin de que el dispositivo fisico administre el medicamento y mande una alerta sonora al usuario.

# con que trabajamos
- Netbeans
- Arduino

# Código arduino
```
#include <Servo.h>


Servo servo1;
Servo servo2;
Servo servo3;
Servo servo4;
int buzzPin = 10;


void setup() {
  Serial.begin(9600);
  pinMode(buzzPin, OUTPUT);
}


void loop() {
  if (Serial.available() > 0) {
    char command = Serial.read();


    if (command == 'A') {
      moverServomotor(command);
      digitalWrite(buzzPin, HIGH);
      delay(500);
      digitalWrite(buzzPin, LOW);
    }
    if (command == 'B') {
      moverServomotor(command);
      digitalWrite(buzzPin, HIGH);
      delay(500);
      digitalWrite(buzzPin, LOW);
    }
    if (command == 'C') {
      moverServomotor(command);
      digitalWrite(buzzPin, HIGH);
      delay(500);
      digitalWrite(buzzPin, LOW);
    }
    if (command == 'D') {
      moverServomotor(command);
      digitalWrite(buzzPin, HIGH);
      delay(500);
      digitalWrite(buzzPin, LOW);
    }
  }
}


void moverServomotor(char servoCommand) {


  // Ejemplo de lógica para mover el servo1
  if (servoCommand == 'A') {
    servo1.attach(3);
    servo1.write(0);
    delay(1000);
    servo1.write(180);
    delay(1000);
    servo1.write(0);
    delay(1000);
    servo1.detach();
  } else if (servoCommand == 'B') {
    servo2.attach(4);
    servo2.write(0);
    delay(1000);
    servo2.write(180);
    delay(1000);
    servo2.write(0);
    delay(1000);
    servo2.detach();
    // Lógica para mover el servo2
  } else if (servoCommand == 'C') {
    servo3.attach(5);
    servo3.write(0);
    delay(1000);
    servo3.write(180);
    delay(1000);
    servo3.write(0);
    delay(1000);
    servo3.detach();
    // Lógica para mover el servo3
  } else if (servoCommand == 'D') {
    servo4.attach(7);
    servo4.write(0);
    delay(1000);
    servo4.write(180);
    delay(1000);
    servo4.write(0);
    delay(1000);
    servo4.detach();
    // Lógica para mover el servo4
  }
}

```
