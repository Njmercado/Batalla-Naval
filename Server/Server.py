import socket
from os import environ
from _thread import *
import json

users = []  #List of users online.
players = [] #List of user playing

#################################################################
#################################################################
#################################################################

class Client:

    def __init__(self, name=None, direction=None, conn=None):
        self.name = name
        self.ip = direction[0]
        self.conn = conn

    def get_json(self):
        return json.loads('{"name" : "' + str(self.name) + '", "ip" : "' + str(self.ip) + '"}')

#################################################################
#################################################################
#################################################################

socket_1 = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

host = ''
# port = env.get('PORT')

if environ.get('PORT') is None:
    port = 8080
else:
    port = int(environ.get('PORT'))

try:
    socket_1.bind((host, port))
except socket.error as e:
    print(e)

socket_1.listen(5)

print("Server is good")


def nuevo_usuario(conn, adr):

    user = conn.recv(2048)
    json_info = json.loads(user.decode('utf-8'))
    users.append(Client(name=json_info['name'], direction=adr, conn=conn))
    
    json_attack = ""
    out = False

    while not out:

        game = conn.recv(2048)
        json_game = json.loads(game.decode('utf-8'))

        if json_game['play'] == 'true':
            
            players.append(Client(name=json_info['name'], direction=adr, conn=conn))    
            opponent = json_game['opponent']
            while True:

                attack = conn.recv(2048)
                json_attack = json.loads(attack.decode('utf-8'))

                if json_attack['out'] != 'close' or json_attack['out'] != 'true':#True is when a i want out of game(log out), but 'close' is when i want close the current game(actual game) 
            
                    for x in users:
                        if opponent == x.name:
                            x.conn.send(string.encode(json_attack))#Send the attack to the opponnent
                            break
                else:

                    if json_attack['out'] == 'true':#If the player decide out of game, log out
                    
                        print("User disconnected from: " + adr[0])
                        players.remove(json_game['name'])
                        users.remove(json_game['name'])
                        conn.close
                        out = True
                        break
                    else: #If the player decide finish the current game.

                        player.remove(json_game['name'])
                        break
        
        

while True:
    conn, adr = socket_1.accept()
    print('User connected from: ' + adr[0] + ', with: ' + str(adr[1]))
    start_new_thread(nuevo_usuario, (conn, adr,))