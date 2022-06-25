CSG vitamin_socket_6mm = Vitamins.get("socket", "6mm")
CSG vitamin_socket_10mm_spline = Vitamins.get("socket", "10mm_spline")
CSG vitamin_socket_1_4_in = Vitamins.get("socket", "1_4_in")
CSG vitamin_socket_19mm_spline = Vitamins.get("socket", "19mm_spline").rotx(180)
CSG vitamin_socket_3_4_in = Vitamins.get("socket", "3_4_in").rotx(180)
CSG vitamin_socket_19mm = Vitamins.get("socket", "19mm").rotx(180)
return [
vitamin_socket_6mm,
vitamin_socket_10mm_spline.movex(25),
vitamin_socket_1_4_in.movex(50),
vitamin_socket_19mm_spline.movez(-vitamin_socket_19mm_spline.getMinZ()).movex(80),
vitamin_socket_3_4_in.movez(-vitamin_socket_3_4_in.getMinZ()).movex(110),
vitamin_socket_19mm.movez(-vitamin_socket_19mm.getMinZ()).movex(140)
]