from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse
from datetime import datetime

def home(request):
    
    return HttpResponse("Welcome to Little Lemon restaurant!")

def homepage(request):
    return HttpResponse("Welcome to Little Lemon")

def display_date(request):
    date_joined= datetime.today().year
    return HttpResponse(date_joined)

def menu(request):
    text= """<h1 style = "color: #F4CE14;"> This is Little Lemon again!</h1>"""
    return HttpResponse(text)

def menuitems(request,dish):
    items= {
        'pasta':'Pasta is a dish',
        'falafel':'lmaoo',
        'cheesecake': 'Cheesecake is a type of dessert'

    }
    description = items[dish]

    return HttpResponse (f"<h2>{dish}</h2>"+description)
