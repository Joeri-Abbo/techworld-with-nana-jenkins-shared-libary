#!/usr/bin/env  groovy
import nl.joeriabbo.Docker

def call() {
    new Docker(this).dockerLogin()
}