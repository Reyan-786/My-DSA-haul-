import speech_recognition as sr
import pyttsx3
import pywhatkit
import datetime
import pyjokes
import wikipedia
from datetime import date
listener=sr.Recognizer()
engine=pyttsx3.init()
voices=engine.getProperty('voices')
engine.setProperty('voice',voices[1].id)
def talk(text):
    engine.say(text)
    engine.runAndWait()
def talk_command():
    try:
        with sr.Microphone() as source:
            print("listening...")
            voice =  listener.listen(source)
            command= listener.recognize_google(voice)
            command=command.lower()
            if 'jarvis' in command:
                command=command.replace('jarvis','')
                print(command)

    except:
        pass
    return command 
def run_VA():
    command= talk_command()
    print(command)
    if 'play' in command:
        song =command.replace('play','')
        talk('Playing...')
        pywhatkit.playonyt(song)
    elif 'time' in command:
        now_time=datetime.datetime.now().strftime('%I:%M %p')
        talk("current time is" + now_time)
        print("current time is" + now_time)
    elif 'who is' in command:
        search_person=command.replace('who is','')
        wikisearchperson=wikipedia.summary(search_person,2)
        talk(wikisearchperson)
        print(wikisearchperson)
    elif 'date' in command:
        now_date=date.today()
        talk(now_date)
        print(now_date)
    elif 'joke' in command:
        joke=pyjokes.get_joke()
        talk(joke)
        print(joke)
    elif 'search' in command:
        search_google=command.replace('search','')
        search_google=pywhatkit.search(command)
        talk(search_google)
        print(search_google)
    elif 'are you single' in command:
        talk('i would love to be in one,but since i am a virtual assistant created by you , i am not capable of doing that')
        
    else :
        talk('Sorry I Did not get that')
        talk('please repeat the command again')




        
run_VA()  