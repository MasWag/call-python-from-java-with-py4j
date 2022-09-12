from py4j.clientserver import ClientServer, JavaParameters, PythonParameters

from dog import Dog

dog = Dog()
gateway = ClientServer(
    java_parameters=JavaParameters(),
    python_parameters=PythonParameters(),
    python_server_entry_point=dog)
