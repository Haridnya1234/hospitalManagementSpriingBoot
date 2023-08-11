import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PharmloginComponent } from './pharmlogin.component';

describe('PharmloginComponent', () => {
  let component: PharmloginComponent;
  let fixture: ComponentFixture<PharmloginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PharmloginComponent]
    });
    fixture = TestBed.createComponent(PharmloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
