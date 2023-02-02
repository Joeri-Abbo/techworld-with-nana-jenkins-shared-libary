#!/usr/bin/env  groovy
import nl.joeriabbo.Docker

def call(String imageName) {
    new Docker(this).dockerPush(imageName)
}