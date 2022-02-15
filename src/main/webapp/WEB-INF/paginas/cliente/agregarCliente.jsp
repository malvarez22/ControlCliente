<div class="modal" id="agregarClienteModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-tittle">
                    Agregar Cliente
                </h5>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required> 
                    </div>                            
                    <div>
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control" name="apellido" required>
                    </div>                            
                    <div>
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required>
                    </div>                            
                    <div>
                        <label for="telefono">Telefono</label>
                        <input type="tel" class="form-control" name="telefono" required>
                    </div>
                    <div>
                        <label for="saldo">Saldo</label>
                        <input type="number" class="form-control" name="saldo" required>
                    </div>    
                </div> 
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">
                        Guardar
                    </button>  
                </div>    
            </form>
        </div>
    </div>
</div>