def replace_string_in_file(file_name, target, replacement):
    with open(file_name, "r") as file:
        contents = file.read()  
    contents = contents.replace(target, replacement)
    
    with open(file_name, "w") as file:
        file.write(contents)

replace_string_in_file("shuffled.fastq", "SimSeq", "Beta")